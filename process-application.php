<?php
if (isset($_POST['submit'])) {
    $to = "ssybrand58@gmail.com";
    $subject = "Job Application Submitted";

    $name = $_POST['name'];
    $email = $_POST['email'];
    $phone = $_POST['phone'];
    $position = $_POST['position'];
    $coverLetter = $_POST['cover-letter'];

    $message = "Full Name: $name\n";
    $message .= "Email: $email\n";
    $message .= "Phone Number: $phone\n";
    $message .= "Position Applying For: $position\n";
    $message .= "Cover Letter:\n$coverLetter";

    // Send email
    $headers = "From: $email";
    $mailSent = mail($to, $subject, $message, $headers);

    if ($mailSent) {
        echo "Application submitted successfully. We will contact you soon.";
    } else {
        echo "There was an error submitting your application.";
    }
}
?>
￼Enter
