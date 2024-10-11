# GpgKeySubkeysInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**can_certify** | **bool** |  | [optional] 
**can_encrypt_comms** | **bool** |  | [optional] 
**can_encrypt_storage** | **bool** |  | [optional] 
**can_sign** | **bool** |  | [optional] 
**created_at** | **str** |  | [optional] 
**emails** | **List[object]** |  | [optional] 
**expires_at** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**key_id** | **str** |  | [optional] 
**primary_key_id** | **int** |  | [optional] 
**public_key** | **str** |  | [optional] 
**raw_key** | **str** |  | [optional] 
**subkeys** | **List[object]** |  | [optional] 

## Example

```python
from openapi_client.models.gpg_key_subkeys_inner import GpgKeySubkeysInner

# TODO update the JSON string below
json = "{}"
# create an instance of GpgKeySubkeysInner from a JSON string
gpg_key_subkeys_inner_instance = GpgKeySubkeysInner.from_json(json)
# print the JSON string representation of the object
print(GpgKeySubkeysInner.to_json())

# convert the object into a dict
gpg_key_subkeys_inner_dict = gpg_key_subkeys_inner_instance.to_dict()
# create an instance of GpgKeySubkeysInner from a dict
gpg_key_subkeys_inner_from_dict = GpgKeySubkeysInner.from_dict(gpg_key_subkeys_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


