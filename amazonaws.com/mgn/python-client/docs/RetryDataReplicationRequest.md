# RetryDataReplicationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_server_id** | **str** | Retry data replication for Source Server ID. | 

## Example

```python
from openapi_client.models.retry_data_replication_request import RetryDataReplicationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RetryDataReplicationRequest from a JSON string
retry_data_replication_request_instance = RetryDataReplicationRequest.from_json(json)
# print the JSON string representation of the object
print(RetryDataReplicationRequest.to_json())

# convert the object into a dict
retry_data_replication_request_dict = retry_data_replication_request_instance.to_dict()
# create an instance of RetryDataReplicationRequest from a dict
retry_data_replication_request_from_dict = RetryDataReplicationRequest.from_dict(retry_data_replication_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


