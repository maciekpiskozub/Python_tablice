import requests

def send_email(api_key, sender, recipient, subject, message):
    url = 'https://api.mail.gw/send_email'
    headers = {'Authorization': f'Bearer {api_key}'}
    payload = {
        'sender': sender,
        'recipient': recipient,
        'subject': subject,
        'message': message
    }
    response = requests.post(url, headers=headers, json=payload)
    if response.status_code == 200:
        print("Email sent successfully!")
    else:
        print("Failed to send email.")
        print("Error message:", response.text)

# Example usage:
api_key = 'your_api_key'
sender = 'your_email@example.com'
recipient = 'recipient@example.com'
subject = 'Test Email'
message = 'This is a test email sent using mail.gw.'

send_email(api_key, sender, recipient, subject, message)