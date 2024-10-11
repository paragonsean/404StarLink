# AbpV11SessionKeys


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**f_nwk_s_int_key** | **str** |  | [optional] 
**s_nwk_s_int_key** | **str** |  | [optional] 
**nwk_s_enc_key** | **str** |  | [optional] 
**app_s_key** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.abp_v11_session_keys import AbpV11SessionKeys

# TODO update the JSON string below
json = "{}"
# create an instance of AbpV11SessionKeys from a JSON string
abp_v11_session_keys_instance = AbpV11SessionKeys.from_json(json)
# print the JSON string representation of the object
print(AbpV11SessionKeys.to_json())

# convert the object into a dict
abp_v11_session_keys_dict = abp_v11_session_keys_instance.to_dict()
# create an instance of AbpV11SessionKeys from a dict
abp_v11_session_keys_from_dict = AbpV11SessionKeys.from_dict(abp_v11_session_keys_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


