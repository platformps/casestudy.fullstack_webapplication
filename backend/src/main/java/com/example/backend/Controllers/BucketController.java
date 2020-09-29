package com.example.backend.Controllers;

import com.example.backend.Services.AmazonClient;
import com.example.backend.models.Bucket;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/storage/")
public class BucketController {

    private AmazonClient amazonClient;

    @Autowired
    BucketController(AmazonClient amazonClient) {
        this.amazonClient = amazonClient;
    }

    @PostMapping("/uploadFile")
    public ResponseEntity<String> uploadFile(@RequestPart(value = "file") MultipartFile file) throws JsonProcessingException {
//        Bucket newBuck = new Bucket(1, this.amazonClient.uploadFile(file));
//        ObjectMapper mapper = new ObjectMapper();
        return new ResponseEntity<String>(this.amazonClient.uploadFile(file), HttpStatus.OK);
    }

    @DeleteMapping("/deleteFile")
    public String deleteFile(@RequestPart(value = "url") String fileUrl) {
        return this.amazonClient.deleteFileFromS3Bucket(fileUrl);
    }
}