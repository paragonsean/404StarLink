# DataReplicationInitiation

Data replication initiation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_attempt_date_time** | **str** |  | [optional] 
**start_date_time** | **str** |  | [optional] 
**steps** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.data_replication_initiation import DataReplicationInitiation

# TODO update the JSON string below
json = "{}"
# create an instance of DataReplicationInitiation from a JSON string
data_replication_initiation_instance = DataReplicationInitiation.from_json(json)
# print the JSON string representation of the object
print(DataReplicationInitiation.to_json())

# convert the object into a dict
data_replication_initiation_dict = data_replication_initiation_instance.to_dict()
# create an instance of DataReplicationInitiation from a dict
data_replication_initiation_from_dict = DataReplicationInitiation.from_dict(data_replication_initiation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


