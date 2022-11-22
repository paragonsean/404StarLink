# GsmObj

GSM object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mcc** | **int** |  | 
**mnc** | **int** |  | 
**lac** | **int** |  | 
**geran_cid** | **int** |  | 
**gsm_local_id** | [**GsmObjGsmLocalId**](GsmObjGsmLocalId.md) |  | [optional] 
**gsm_timing_advance** | **int** |  | [optional] 
**rx_level** | **int** |  | [optional] 
**gsm_nmr** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.gsm_obj import GsmObj

# TODO update the JSON string below
json = "{}"
# create an instance of GsmObj from a JSON string
gsm_obj_instance = GsmObj.from_json(json)
# print the JSON string representation of the object
print(GsmObj.to_json())

# convert the object into a dict
gsm_obj_dict = gsm_obj_instance.to_dict()
# create an instance of GsmObj from a dict
gsm_obj_from_dict = GsmObj.from_dict(gsm_obj_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


