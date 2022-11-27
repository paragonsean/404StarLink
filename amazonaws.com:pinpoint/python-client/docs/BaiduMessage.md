# BaiduMessage

Specifies the settings for a one-time message that's sent directly to an endpoint through the Baidu (Baidu Cloud Push) channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**Action**](Action.md) |  | [optional] 
**body** | **str** |  | [optional] 
**data** | **Dict** |  | [optional] 
**icon_reference** | **str** |  | [optional] 
**image_icon_url** | **str** |  | [optional] 
**image_url** | **str** |  | [optional] 
**raw_content** | **str** |  | [optional] 
**silent_push** | **bool** |  | [optional] 
**small_image_icon_url** | **str** |  | [optional] 
**sound** | **str** |  | [optional] 
**substitutions** | **Dict** |  | [optional] 
**time_to_live** | **int** |  | [optional] 
**title** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.baidu_message import BaiduMessage

# TODO update the JSON string below
json = "{}"
# create an instance of BaiduMessage from a JSON string
baidu_message_instance = BaiduMessage.from_json(json)
# print the JSON string representation of the object
print(BaiduMessage.to_json())

# convert the object into a dict
baidu_message_dict = baidu_message_instance.to_dict()
# create an instance of BaiduMessage from a dict
baidu_message_from_dict = BaiduMessage.from_dict(baidu_message_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


