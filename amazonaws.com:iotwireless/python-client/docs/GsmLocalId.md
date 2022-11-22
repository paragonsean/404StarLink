# GsmLocalId

GSM local ID information, which corresponds to the local identification parameters of a GSM cell.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bsic** | **int** |  | 
**bcch** | **int** |  | 

## Example

```python
from openapi_client.models.gsm_local_id import GsmLocalId

# TODO update the JSON string below
json = "{}"
# create an instance of GsmLocalId from a JSON string
gsm_local_id_instance = GsmLocalId.from_json(json)
# print the JSON string representation of the object
print(GsmLocalId.to_json())

# convert the object into a dict
gsm_local_id_dict = gsm_local_id_instance.to_dict()
# create an instance of GsmLocalId from a dict
gsm_local_id_from_dict = GsmLocalId.from_dict(gsm_local_id_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


