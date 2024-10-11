

# GoogleCloudRecaptchaenterpriseV1TransactionDataUser

Details about a user's account involved in the transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Unique account identifier for this user. If using account defender, this should match the hashed_account_id field. Otherwise, a unique and persistent identifier for this account. |  [optional] |
|**creationMs** | **String** | The epoch milliseconds of the user&#39;s account creation. |  [optional] |
|**email** | **String** | The email address of the user. |  [optional] |
|**emailVerified** | **Boolean** | Whether the email has been verified to be accessible by the user (OTP or similar). |  [optional] |
|**phoneNumber** | **String** | The phone number of the user, with country code. |  [optional] |
|**phoneVerified** | **Boolean** | Whether the phone number has been verified to be accessible by the user (OTP or similar). |  [optional] |



