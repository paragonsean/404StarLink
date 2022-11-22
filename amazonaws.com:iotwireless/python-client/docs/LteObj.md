# LteObj

LTE object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mcc** | **int** |  | 
**mnc** | **int** |  | 
**eutran_cid** | **int** |  | 
**tac** | **int** |  | [optional] 
**lte_local_id** | [**LteObjLteLocalId**](LteObjLteLocalId.md) |  | [optional] 
**lte_timing_advance** | **int** |  | [optional] 
**rsrp** | **int** |  | [optional] 
**rsrq** | **float** |  | [optional] 
**nr_capable** | **bool** |  | [optional] 
**lte_nmr** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.lte_obj import LteObj

# TODO update the JSON string below
json = "{}"
# create an instance of LteObj from a JSON string
lte_obj_instance = LteObj.from_json(json)
# print the JSON string representation of the object
print(LteObj.to_json())

# convert the object into a dict
lte_obj_dict = lte_obj_instance.to_dict()
# create an instance of LteObj from a dict
lte_obj_from_dict = LteObj.from_dict(lte_obj_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


