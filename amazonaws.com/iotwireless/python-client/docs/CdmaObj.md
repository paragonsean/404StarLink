# CdmaObj

CDMA (Code-division multiple access) object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**system_id** | **int** |  | 
**network_id** | **int** |  | 
**base_station_id** | **int** |  | 
**registration_zone** | **int** |  | [optional] 
**cdma_local_id** | [**CdmaObjCdmaLocalId**](CdmaObjCdmaLocalId.md) |  | [optional] 
**pilot_power** | **int** |  | [optional] 
**base_lat** | **float** |  | [optional] 
**base_lng** | **float** |  | [optional] 
**cdma_nmr** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.cdma_obj import CdmaObj

# TODO update the JSON string below
json = "{}"
# create an instance of CdmaObj from a JSON string
cdma_obj_instance = CdmaObj.from_json(json)
# print the JSON string representation of the object
print(CdmaObj.to_json())

# convert the object into a dict
cdma_obj_dict = cdma_obj_instance.to_dict()
# create an instance of CdmaObj from a dict
cdma_obj_from_dict = CdmaObj.from_dict(cdma_obj_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


