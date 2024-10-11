

# AddMatterPermissionsRequest

Add an account with the permission specified. The role cannot be owner. If an account already has a role in the matter, the existing role is overwritten.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ccMe** | **Boolean** | Only relevant if **sendEmails** is **true**. To CC the requestor in the email message, set to **true**. To not CC requestor, set to **false**. |  [optional] |
|**matterPermission** | [**MatterPermission**](MatterPermission.md) |  |  [optional] |
|**sendEmails** | **Boolean** | To send a notification email to the added account, set to **true**. To not send a notification email, set to **false**. |  [optional] |



