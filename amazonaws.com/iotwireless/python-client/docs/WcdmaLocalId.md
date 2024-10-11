# WcdmaLocalId

WCDMA local identification (local ID) information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uarfcndl** | **int** |  | 
**psc** | **int** |  | 

## Example

```python
from openapi_client.models.wcdma_local_id import WcdmaLocalId

# TODO update the JSON string below
json = "{}"
# create an instance of WcdmaLocalId from a JSON string
wcdma_local_id_instance = WcdmaLocalId.from_json(json)
# print the JSON string representation of the object
print(WcdmaLocalId.to_json())

# convert the object into a dict
wcdma_local_id_dict = wcdma_local_id_instance.to_dict()
# create an instance of WcdmaLocalId from a dict
wcdma_local_id_from_dict = WcdmaLocalId.from_dict(wcdma_local_id_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


