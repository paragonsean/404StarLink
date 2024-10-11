# TdscdmaNmrObj

TD-SCDMA object for network measurement reports.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uarfcn** | **int** |  | 
**cell_params** | **int** |  | 
**utran_cid** | **int** |  | [optional] 
**rscp** | **int** |  | [optional] 
**path_loss** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.tdscdma_nmr_obj import TdscdmaNmrObj

# TODO update the JSON string below
json = "{}"
# create an instance of TdscdmaNmrObj from a JSON string
tdscdma_nmr_obj_instance = TdscdmaNmrObj.from_json(json)
# print the JSON string representation of the object
print(TdscdmaNmrObj.to_json())

# convert the object into a dict
tdscdma_nmr_obj_dict = tdscdma_nmr_obj_instance.to_dict()
# create an instance of TdscdmaNmrObj from a dict
tdscdma_nmr_obj_from_dict = TdscdmaNmrObj.from_dict(tdscdma_nmr_obj_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


