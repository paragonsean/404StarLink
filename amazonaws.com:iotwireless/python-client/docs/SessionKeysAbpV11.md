# SessionKeysAbpV11

Session keys for ABP v1.1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**f_nwk_s_int_key** | **str** |  | [optional] 
**s_nwk_s_int_key** | **str** |  | [optional] 
**nwk_s_enc_key** | **str** |  | [optional] 
**app_s_key** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.session_keys_abp_v11 import SessionKeysAbpV11

# TODO update the JSON string below
json = "{}"
# create an instance of SessionKeysAbpV11 from a JSON string
session_keys_abp_v11_instance = SessionKeysAbpV11.from_json(json)
# print the JSON string representation of the object
print(SessionKeysAbpV11.to_json())

# convert the object into a dict
session_keys_abp_v11_dict = session_keys_abp_v11_instance.to_dict()
# create an instance of SessionKeysAbpV11 from a dict
session_keys_abp_v11_from_dict = SessionKeysAbpV11.from_dict(session_keys_abp_v11_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


