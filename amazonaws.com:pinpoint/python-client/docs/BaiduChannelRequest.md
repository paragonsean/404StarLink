# BaiduChannelRequest

Specifies the status and settings of the Baidu (Baidu Cloud Push) channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**api_key** | **str** |  | 
**enabled** | **bool** |  | [optional] 
**secret_key** | **str** |  | 

## Example

```python
from openapi_client.models.baidu_channel_request import BaiduChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BaiduChannelRequest from a JSON string
baidu_channel_request_instance = BaiduChannelRequest.from_json(json)
# print the JSON string representation of the object
print(BaiduChannelRequest.to_json())

# convert the object into a dict
baidu_channel_request_dict = baidu_channel_request_instance.to_dict()
# create an instance of BaiduChannelRequest from a dict
baidu_channel_request_from_dict = BaiduChannelRequest.from_dict(baidu_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


