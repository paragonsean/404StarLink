# EndpointBatchItem

Specifies an endpoint to create or update and the settings and attributes to set or change for the endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** |  | [optional] 
**attributes** | **Dict** |  | [optional] 
**channel_type** | [**ChannelType**](ChannelType.md) |  | [optional] 
**demographic** | [**UpdateEndpointRequestEndpointRequestDemographic**](UpdateEndpointRequestEndpointRequestDemographic.md) |  | [optional] 
**effective_date** | **str** |  | [optional] 
**endpoint_status** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**location** | [**UpdateEndpointRequestEndpointRequestLocation**](UpdateEndpointRequestEndpointRequestLocation.md) |  | [optional] 
**metrics** | **Dict** |  | [optional] 
**opt_out** | **str** |  | [optional] 
**request_id** | **str** |  | [optional] 
**user** | [**UpdateEndpointRequestEndpointRequestUser**](UpdateEndpointRequestEndpointRequestUser.md) |  | [optional] 

## Example

```python
from openapi_client.models.endpoint_batch_item import EndpointBatchItem

# TODO update the JSON string below
json = "{}"
# create an instance of EndpointBatchItem from a JSON string
endpoint_batch_item_instance = EndpointBatchItem.from_json(json)
# print the JSON string representation of the object
print(EndpointBatchItem.to_json())

# convert the object into a dict
endpoint_batch_item_dict = endpoint_batch_item_instance.to_dict()
# create an instance of EndpointBatchItem from a dict
endpoint_batch_item_from_dict = EndpointBatchItem.from_dict(endpoint_batch_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


