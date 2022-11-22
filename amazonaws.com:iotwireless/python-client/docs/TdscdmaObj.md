# TdscdmaObj

TD-SCDMA object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mcc** | **int** |  | 
**mnc** | **int** |  | 
**lac** | **int** |  | [optional] 
**utran_cid** | **int** |  | 
**tdscdma_local_id** | [**TdscdmaObjTdscdmaLocalId**](TdscdmaObjTdscdmaLocalId.md) |  | [optional] 
**tdscdma_timing_advance** | **int** |  | [optional] 
**rscp** | **int** |  | [optional] 
**path_loss** | **int** |  | [optional] 
**tdscdma_nmr** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.tdscdma_obj import TdscdmaObj

# TODO update the JSON string below
json = "{}"
# create an instance of TdscdmaObj from a JSON string
tdscdma_obj_instance = TdscdmaObj.from_json(json)
# print the JSON string representation of the object
print(TdscdmaObj.to_json())

# convert the object into a dict
tdscdma_obj_dict = tdscdma_obj_instance.to_dict()
# create an instance of TdscdmaObj from a dict
tdscdma_obj_from_dict = TdscdmaObj.from_dict(tdscdma_obj_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


