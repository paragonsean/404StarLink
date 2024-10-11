# ChannelResponse

Provides information about the general settings and status of a channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | [optional] 
**creation_date** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 
**has_credential** | **bool** |  | [optional] 
**id** | **str** |  | [optional] 
**is_archived** | **bool** |  | [optional] 
**last_modified_by** | **str** |  | [optional] 
**last_modified_date** | **str** |  | [optional] 
**version** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.channel_response import ChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ChannelResponse from a JSON string
channel_response_instance = ChannelResponse.from_json(json)
# print the JSON string representation of the object
print(ChannelResponse.to_json())

# convert the object into a dict
channel_response_dict = channel_response_instance.to_dict()
# create an instance of ChannelResponse from a dict
channel_response_from_dict = ChannelResponse.from_dict(channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


