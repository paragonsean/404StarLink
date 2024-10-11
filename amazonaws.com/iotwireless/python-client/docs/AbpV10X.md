# AbpV10X

ABP device object for LoRaWAN specification v1.0.x

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dev_addr** | **str** |  | [optional] 
**session_keys** | [**AbpV10XSessionKeys**](AbpV10XSessionKeys.md) |  | [optional] 
**f_cnt_start** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.abp_v10_x import AbpV10X

# TODO update the JSON string below
json = "{}"
# create an instance of AbpV10X from a JSON string
abp_v10_x_instance = AbpV10X.from_json(json)
# print the JSON string representation of the object
print(AbpV10X.to_json())

# convert the object into a dict
abp_v10_x_dict = abp_v10_x_instance.to_dict()
# create an instance of AbpV10X from a dict
abp_v10_x_from_dict = AbpV10X.from_dict(abp_v10_x_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


