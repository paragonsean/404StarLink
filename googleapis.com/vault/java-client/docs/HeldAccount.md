

# HeldAccount

An account covered by a hold. This structure is immutable. It can be an individual account or a Google Group, depending on the service. To work with Vault resources, the account must have the [required Vault privileges] (https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter, the account must have created the matter, have the matter shared with them, or have the **View All Matters** privilege.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The account ID, as provided by the [Admin SDK](https://developers.google.com/admin-sdk/). |  [optional] |
|**email** | **String** | The primary email address of the account. If used as an input, this takes precedence over **accountId**. |  [optional] |
|**firstName** | **String** | Output only. The first name of the account holder. |  [optional] |
|**holdTime** | **String** | Output only. When the account was put on hold. |  [optional] |
|**lastName** | **String** | Output only. The last name of the account holder. |  [optional] |



