# GpgKey

A unique encryption key

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**can_certify** | **bool** |  | 
**can_encrypt_comms** | **bool** |  | 
**can_encrypt_storage** | **bool** |  | 
**can_sign** | **bool** |  | 
**created_at** | **datetime** |  | 
**emails** | [**List[GpgKeyEmailsInner]**](GpgKeyEmailsInner.md) |  | 
**expires_at** | **datetime** |  | 
**id** | **int** |  | 
**key_id** | **str** |  | 
**primary_key_id** | **int** |  | 
**public_key** | **str** |  | 
**raw_key** | **str** |  | 
**subkeys** | [**List[GpgKeySubkeysInner]**](GpgKeySubkeysInner.md) |  | 

## Example

```python
from openapi_client.models.gpg_key import GpgKey

# TODO update the JSON string below
json = "{}"
# create an instance of GpgKey from a JSON string
gpg_key_instance = GpgKey.from_json(json)
# print the JSON string representation of the object
print(GpgKey.to_json())

# convert the object into a dict
gpg_key_dict = gpg_key_instance.to_dict()
# create an instance of GpgKey from a dict
gpg_key_from_dict = GpgKey.from_dict(gpg_key_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


