# BaiduChannelResponse

Provides information about the status and settings of the Baidu (Baidu Cloud Push) channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | [optional] 
**creation_date** | **str** |  | [optional] 
**credential** | **str** |  | 
**enabled** | **bool** |  | [optional] 
**has_credential** | **bool** |  | [optional] 
**id** | **str** |  | [optional] 
**is_archived** | **bool** |  | [optional] 
**last_modified_by** | **str** |  | [optional] 
**last_modified_date** | **str** |  | [optional] 
**platform** | **str** |  | 
**version** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.baidu_channel_response import BaiduChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of BaiduChannelResponse from a JSON string
baidu_channel_response_instance = BaiduChannelResponse.from_json(json)
# print the JSON string representation of the object
print(BaiduChannelResponse.to_json())

# convert the object into a dict
baidu_channel_response_dict = baidu_channel_response_instance.to_dict()
# create an instance of BaiduChannelResponse from a dict
baidu_channel_response_from_dict = BaiduChannelResponse.from_dict(baidu_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


