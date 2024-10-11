# CdmaLocalId

CDMA local ID information, which corresponds to the local identification parameters of a CDMA cell.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pn_offset** | **int** |  | 
**cdma_channel** | **int** |  | 

## Example

```python
from openapi_client.models.cdma_local_id import CdmaLocalId

# TODO update the JSON string below
json = "{}"
# create an instance of CdmaLocalId from a JSON string
cdma_local_id_instance = CdmaLocalId.from_json(json)
# print the JSON string representation of the object
print(CdmaLocalId.to_json())

# convert the object into a dict
cdma_local_id_dict = cdma_local_id_instance.to_dict()
# create an instance of CdmaLocalId from a dict
cdma_local_id_from_dict = CdmaLocalId.from_dict(cdma_local_id_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


