# TdscdmaLocalId

TD-SCDMA local identification (local Id) information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uarfcn** | **int** |  | 
**cell_params** | **int** |  | 

## Example

```python
from openapi_client.models.tdscdma_local_id import TdscdmaLocalId

# TODO update the JSON string below
json = "{}"
# create an instance of TdscdmaLocalId from a JSON string
tdscdma_local_id_instance = TdscdmaLocalId.from_json(json)
# print the JSON string representation of the object
print(TdscdmaLocalId.to_json())

# convert the object into a dict
tdscdma_local_id_dict = tdscdma_local_id_instance.to_dict()
# create an instance of TdscdmaLocalId from a dict
tdscdma_local_id_from_dict = TdscdmaLocalId.from_dict(tdscdma_local_id_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


