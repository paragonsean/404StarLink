

# MatterPermission

Users can be matter owners or collaborators. Each matter has only one owner. All others users who can access the matter are collaborators. When an account is purged, its corresponding MatterPermission resources cease to exist.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | The account ID, as provided by the [Admin SDK](https://developers.google.com/admin-sdk/). |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | The user&#39;s role for the matter. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ROLE_UNSPECIFIED | &quot;ROLE_UNSPECIFIED&quot; |
| COLLABORATOR | &quot;COLLABORATOR&quot; |
| OWNER | &quot;OWNER&quot; |



