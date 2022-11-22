# WcdmaObj

WCDMA.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mcc** | **int** |  | 
**mnc** | **int** |  | 
**lac** | **int** |  | [optional] 
**utran_cid** | **int** |  | 
**wcdma_local_id** | [**WcdmaObjWcdmaLocalId**](WcdmaObjWcdmaLocalId.md) |  | [optional] 
**rscp** | **int** |  | [optional] 
**path_loss** | **int** |  | [optional] 
**wcdma_nmr** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.wcdma_obj import WcdmaObj

# TODO update the JSON string below
json = "{}"
# create an instance of WcdmaObj from a JSON string
wcdma_obj_instance = WcdmaObj.from_json(json)
# print the JSON string representation of the object
print(WcdmaObj.to_json())

# convert the object into a dict
wcdma_obj_dict = wcdma_obj_instance.to_dict()
# create an instance of WcdmaObj from a dict
wcdma_obj_from_dict = WcdmaObj.from_dict(wcdma_obj_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


