# LteLocalId

LTE local identification (local ID) information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pci** | **int** |  | 
**earfcn** | **int** |  | 

## Example

```python
from openapi_client.models.lte_local_id import LteLocalId

# TODO update the JSON string below
json = "{}"
# create an instance of LteLocalId from a JSON string
lte_local_id_instance = LteLocalId.from_json(json)
# print the JSON string representation of the object
print(LteLocalId.to_json())

# convert the object into a dict
lte_local_id_dict = lte_local_id_instance.to_dict()
# create an instance of LteLocalId from a dict
lte_local_id_from_dict = LteLocalId.from_dict(lte_local_id_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


