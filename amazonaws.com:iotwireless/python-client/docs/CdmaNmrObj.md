# CdmaNmrObj

CDMA object for network measurement reports.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pn_offset** | **int** |  | 
**cdma_channel** | **int** |  | 
**pilot_power** | **int** |  | [optional] 
**base_station_id** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.cdma_nmr_obj import CdmaNmrObj

# TODO update the JSON string below
json = "{}"
# create an instance of CdmaNmrObj from a JSON string
cdma_nmr_obj_instance = CdmaNmrObj.from_json(json)
# print the JSON string representation of the object
print(CdmaNmrObj.to_json())

# convert the object into a dict
cdma_nmr_obj_dict = cdma_nmr_obj_instance.to_dict()
# create an instance of CdmaNmrObj from a dict
cdma_nmr_obj_from_dict = CdmaNmrObj.from_dict(cdma_nmr_obj_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


