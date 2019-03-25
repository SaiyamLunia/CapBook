//package com.cg.capbook.controllers;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import com.cg.capbook.beans.UserProfile;
//import com.cg.capbook.exceptions.InvalidEmailException;
//import com.cg.capbook.services.ImageService;
//import com.cg.capbook.services.UserProfileService;
//@Controller
//public class UploadPicController {
//	//Save the uploaded file to this folder
//    private static String UPLOADED_FOLDER = "C://Users//ADM-IG-HWDLAB1D//git//CapBookLocalRepoTeam2//CapBookStore//src//main//resources//static//images//";
//
//    @Autowired
//	private UserProfileService userProfileService;
//    @Autowired
//    private ImageService imageService;
//    
////    @GetMapping("/")
////    public String index() {
////        return "upload";
////    }
//
//    @PostMapping("/upload") // //new annotation since 4.3
//    public String singleFileUpload(@RequestParam("file") MultipartFile file,
//                                   RedirectAttributes redirectAttributes,@RequestParam String emailId) throws InvalidEmailException {
//
//        if (file.isEmpty()) {
//            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
//            return "redirect:uploadStatus";
//        }
//
//        try {
//
//            // Get the file and save it somewhere
//            byte[] bytes = file.getBytes();
//            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
//            Files.write(path, bytes);
//            UserProfile user=userProfileService.getUserDetails(emailId);
//            String imageUrl=""+path;
//            imageService.addImage(imageUrl, user);
//
//            redirectAttributes.addFlashAttribute("message",
//                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return "redirect:/uploadStatus";
//    }
//
//    @GetMapping("/uploadStatus")
//    public String uploadStatus() {
//        return "uploadStatus";
//    }
//}
