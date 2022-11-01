# ActionsPublicKey

The public key used for setting Actions Secrets.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**key** | **str** | The Base64 encoded public key. | 
**key_id** | **str** | The identifier for the key. | 
**title** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.actions_public_key import ActionsPublicKey

# TODO update the JSON string below
json = "{}"
# create an instance of ActionsPublicKey from a JSON string
actions_public_key_instance = ActionsPublicKey.from_json(json)
# print the JSON string representation of the object
print(ActionsPublicKey.to_json())

# convert the object into a dict
actions_public_key_dict = actions_public_key_instance.to_dict()
# create an instance of ActionsPublicKey from a dict
actions_public_key_from_dict = ActionsPublicKey.from_dict(actions_public_key_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


