# EmailChannelResponse

Provides information about the status and settings of the email channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | [optional] 
**configuration_set** | **str** |  | [optional] 
**creation_date** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 
**from_address** | **str** |  | [optional] 
**has_credential** | **bool** |  | [optional] 
**id** | **str** |  | [optional] 
**identity** | **str** |  | [optional] 
**is_archived** | **bool** |  | [optional] 
**last_modified_by** | **str** |  | [optional] 
**last_modified_date** | **str** |  | [optional] 
**messages_per_second** | **int** |  | [optional] 
**platform** | **str** |  | 
**role_arn** | **str** |  | [optional] 
**version** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.email_channel_response import EmailChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of EmailChannelResponse from a JSON string
email_channel_response_instance = EmailChannelResponse.from_json(json)
# print the JSON string representation of the object
print(EmailChannelResponse.to_json())

# convert the object into a dict
email_channel_response_dict = email_channel_response_instance.to_dict()
# create an instance of EmailChannelResponse from a dict
email_channel_response_from_dict = EmailChannelResponse.from_dict(email_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


