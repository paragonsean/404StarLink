# PublicKeyFull


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | 
**id** | **int** |  | 
**key** | **str** |  | 
**read_only** | **bool** |  | 
**repository_id** | **int** |  | 
**title** | **str** |  | 
**url** | **str** |  | 
**user_id** | **int** |  | 
**verified** | **bool** |  | 

## Example

```python
from openapi_client.models.public_key_full import PublicKeyFull

# TODO update the JSON string below
json = "{}"
# create an instance of PublicKeyFull from a JSON string
public_key_full_instance = PublicKeyFull.from_json(json)
# print the JSON string representation of the object
print(PublicKeyFull.to_json())

# convert the object into a dict
public_key_full_dict = public_key_full_instance.to_dict()
# create an instance of PublicKeyFull from a dict
public_key_full_from_dict = PublicKeyFull.from_dict(public_key_full_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


