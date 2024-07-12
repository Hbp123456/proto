document.getElementById('messageForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const status = document.getElementById('status');
    const form = event.target;

    emailjs.sendForm('service_k9n6xfs', 'template_91s28cr', form)
        .then(function(response) {
            console.log('SUCCESS!', response.status, response.text);
            status.textContent = 'Message sent successfully!';
            status.style.color = 'green';
            form.reset();
        }, function(error) {
            console.log('FAILED...', error);
            status.textContent = 'Failed to send message. Please try again.';
            status.style.color = 'red';
        });
});
