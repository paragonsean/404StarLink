# InputDecryptionSettings


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**decryption_mode** | [**DecryptionMode**](DecryptionMode.md) |  | [optional] 
**encrypted_decryption_key** | **str** |  | [optional] 
**initialization_vector** | **str** |  | [optional] 
**kms_key_region** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.input_decryption_settings import InputDecryptionSettings

# TODO update the JSON string below
json = "{}"
# create an instance of InputDecryptionSettings from a JSON string
input_decryption_settings_instance = InputDecryptionSettings.from_json(json)
# print the JSON string representation of the object
print(InputDecryptionSettings.to_json())

# convert the object into a dict
input_decryption_settings_dict = input_decryption_settings_instance.to_dict()
# create an instance of InputDecryptionSettings from a dict
input_decryption_settings_from_dict = InputDecryptionSettings.from_dict(input_decryption_settings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


