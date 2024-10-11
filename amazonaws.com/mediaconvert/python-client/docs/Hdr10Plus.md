# Hdr10Plus

Setting for HDR10+ metadata insertion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mastering_monitor_nits** | **int** |  | [optional] 
**target_monitor_nits** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.hdr10_plus import Hdr10Plus

# TODO update the JSON string below
json = "{}"
# create an instance of Hdr10Plus from a JSON string
hdr10_plus_instance = Hdr10Plus.from_json(json)
# print the JSON string representation of the object
print(Hdr10Plus.to_json())

# convert the object into a dict
hdr10_plus_dict = hdr10_plus_instance.to_dict()
# create an instance of Hdr10Plus from a dict
hdr10_plus_from_dict = Hdr10Plus.from_dict(hdr10_plus_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


