# UpdateEmailChannelRequestEmailChannelRequest

Specifies the status and settings of the email channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configuration_set** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 
**from_address** | **str** |  | [optional] 
**identity** | **str** |  | [optional] 
**role_arn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.update_email_channel_request_email_channel_request import UpdateEmailChannelRequestEmailChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEmailChannelRequestEmailChannelRequest from a JSON string
update_email_channel_request_email_channel_request_instance = UpdateEmailChannelRequestEmailChannelRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateEmailChannelRequestEmailChannelRequest.to_json())

# convert the object into a dict
update_email_channel_request_email_channel_request_dict = update_email_channel_request_email_channel_request_instance.to_dict()
# create an instance of UpdateEmailChannelRequestEmailChannelRequest from a dict
update_email_channel_request_email_channel_request_from_dict = UpdateEmailChannelRequestEmailChannelRequest.from_dict(update_email_channel_request_email_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


