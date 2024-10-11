

# DriveOptions

Additional options for Drive search

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientSideEncryptedOption** | [**ClientSideEncryptedOptionEnum**](#ClientSideEncryptedOptionEnum) | Set whether the results include only content encrypted with [Google Workspace Client-side encryption](https://support.google.com/a?p&#x3D;cse_ov) content, only unencrypted content, or both. Defaults to both. Currently supported for Drive. |  [optional] |
|**includeSharedDrives** | **Boolean** | Set to **true** to include shared drives. |  [optional] |
|**includeTeamDrives** | **Boolean** | Set to true to include Team Drive. |  [optional] |
|**versionDate** | **String** | Search the current version of the Drive file, but export the contents of the last version saved before 12:00 AM UTC on the specified date. Enter the date in UTC. |  [optional] |



## Enum: ClientSideEncryptedOptionEnum

| Name | Value |
|---- | -----|
| UNSPECIFIED | &quot;CLIENT_SIDE_ENCRYPTED_OPTION_UNSPECIFIED&quot; |
| ANY | &quot;CLIENT_SIDE_ENCRYPTED_OPTION_ANY&quot; |
| ENCRYPTED | &quot;CLIENT_SIDE_ENCRYPTED_OPTION_ENCRYPTED&quot; |
| UNENCRYPTED | &quot;CLIENT_SIDE_ENCRYPTED_OPTION_UNENCRYPTED&quot; |



