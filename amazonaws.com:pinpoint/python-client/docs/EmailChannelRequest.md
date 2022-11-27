# EmailChannelRequest

Specifies the status and settings of the email channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configuration_set** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 
**from_address** | **str** |  | 
**identity** | **str** |  | 
**role_arn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.email_channel_request import EmailChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of EmailChannelRequest from a JSON string
email_channel_request_instance = EmailChannelRequest.from_json(json)
# print the JSON string representation of the object
print(EmailChannelRequest.to_json())

# convert the object into a dict
email_channel_request_dict = email_channel_request_instance.to_dict()
# create an instance of EmailChannelRequest from a dict
email_channel_request_from_dict = EmailChannelRequest.from_dict(email_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


