# AbpV11

ABP device object for LoRaWAN specification v1.1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dev_addr** | **str** |  | [optional] 
**session_keys** | [**AbpV11SessionKeys**](AbpV11SessionKeys.md) |  | [optional] 
**f_cnt_start** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.abp_v11 import AbpV11

# TODO update the JSON string below
json = "{}"
# create an instance of AbpV11 from a JSON string
abp_v11_instance = AbpV11.from_json(json)
# print the JSON string representation of the object
print(AbpV11.to_json())

# convert the object into a dict
abp_v11_dict = abp_v11_instance.to_dict()
# create an instance of AbpV11 from a dict
abp_v11_from_dict = AbpV11.from_dict(abp_v11_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


