# UpdateBaiduChannelRequestBaiduChannelRequest

Specifies the status and settings of the Baidu (Baidu Cloud Push) channel for an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**api_key** | **str** |  | [optional] 
**enabled** | **bool** |  | [optional] 
**secret_key** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.update_baidu_channel_request_baidu_channel_request import UpdateBaiduChannelRequestBaiduChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateBaiduChannelRequestBaiduChannelRequest from a JSON string
update_baidu_channel_request_baidu_channel_request_instance = UpdateBaiduChannelRequestBaiduChannelRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateBaiduChannelRequestBaiduChannelRequest.to_json())

# convert the object into a dict
update_baidu_channel_request_baidu_channel_request_dict = update_baidu_channel_request_baidu_channel_request_instance.to_dict()
# create an instance of UpdateBaiduChannelRequestBaiduChannelRequest from a dict
update_baidu_channel_request_baidu_channel_request_from_dict = UpdateBaiduChannelRequestBaiduChannelRequest.from_dict(update_baidu_channel_request_baidu_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


