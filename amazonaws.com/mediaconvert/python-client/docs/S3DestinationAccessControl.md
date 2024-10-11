# S3DestinationAccessControl

Optional. Have MediaConvert automatically apply Amazon S3 access control for the outputs in this output group. When you don't use this setting, S3 automatically applies the default access control list PRIVATE.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canned_acl** | [**S3ObjectCannedAcl**](S3ObjectCannedAcl.md) |  | [optional] 

## Example

```python
from openapi_client.models.s3_destination_access_control import S3DestinationAccessControl

# TODO update the JSON string below
json = "{}"
# create an instance of S3DestinationAccessControl from a JSON string
s3_destination_access_control_instance = S3DestinationAccessControl.from_json(json)
# print the JSON string representation of the object
print(S3DestinationAccessControl.to_json())

# convert the object into a dict
s3_destination_access_control_dict = s3_destination_access_control_instance.to_dict()
# create an instance of S3DestinationAccessControl from a dict
s3_destination_access_control_from_dict = S3DestinationAccessControl.from_dict(s3_destination_access_control_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


