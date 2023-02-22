

# EntityUserLinkPermissions

Permissions the user has for this entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**effective** | **List&lt;String&gt;** | Effective permissions represent all the permissions that a user has for this entity. These include any implied permissions (e.g., EDIT implies VIEW) or inherited permissions from the parent entity. Effective permissions are read-only. |  [optional] [readonly] |
|**local** | **List&lt;String&gt;** | Permissions that a user has been assigned at this very level. Does not include any implied or inherited permissions. Local permissions are modifiable. |  [optional] |



