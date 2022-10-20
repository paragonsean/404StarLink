# coding: utf-8

"""
    Application Migration Service

    The Application Migration Service service.

    The version of the OpenAPI document: 2020-02-26
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class ReplicationConfiguration(BaseModel):
    """
    ReplicationConfiguration
    """ # noqa: E501
    associate_default_security_group: Optional[Any] = Field(default=None, alias="associateDefaultSecurityGroup")
    bandwidth_throttling: Optional[Any] = Field(default=None, alias="bandwidthThrottling")
    create_public_ip: Optional[Any] = Field(default=None, alias="createPublicIP")
    data_plane_routing: Optional[Any] = Field(default=None, alias="dataPlaneRouting")
    default_large_staging_disk_type: Optional[Any] = Field(default=None, alias="defaultLargeStagingDiskType")
    ebs_encryption: Optional[Any] = Field(default=None, alias="ebsEncryption")
    ebs_encryption_key_arn: Optional[Any] = Field(default=None, alias="ebsEncryptionKeyArn")
    name: Optional[Any] = None
    replicated_disks: Optional[Any] = Field(default=None, alias="replicatedDisks")
    replication_server_instance_type: Optional[Any] = Field(default=None, alias="replicationServerInstanceType")
    replication_servers_security_groups_ids: Optional[Any] = Field(default=None, alias="replicationServersSecurityGroupsIDs")
    source_server_id: Optional[Any] = Field(default=None, alias="sourceServerID")
    staging_area_subnet_id: Optional[Any] = Field(default=None, alias="stagingAreaSubnetId")
    staging_area_tags: Optional[Any] = Field(default=None, alias="stagingAreaTags")
    use_dedicated_replication_server: Optional[Any] = Field(default=None, alias="useDedicatedReplicationServer")
    __properties: ClassVar[List[str]] = ["associateDefaultSecurityGroup", "bandwidthThrottling", "createPublicIP", "dataPlaneRouting", "defaultLargeStagingDiskType", "ebsEncryption", "ebsEncryptionKeyArn", "name", "replicatedDisks", "replicationServerInstanceType", "replicationServersSecurityGroupsIDs", "sourceServerID", "stagingAreaSubnetId", "stagingAreaTags", "useDedicatedReplicationServer"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of ReplicationConfiguration from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of data_plane_routing
        if self.data_plane_routing:
            _dict['dataPlaneRouting'] = self.data_plane_routing.to_dict()
        # override the default output from pydantic by calling `to_dict()` of default_large_staging_disk_type
        if self.default_large_staging_disk_type:
            _dict['defaultLargeStagingDiskType'] = self.default_large_staging_disk_type.to_dict()
        # override the default output from pydantic by calling `to_dict()` of ebs_encryption
        if self.ebs_encryption:
            _dict['ebsEncryption'] = self.ebs_encryption.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ReplicationConfiguration from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "associateDefaultSecurityGroup": obj.get("associateDefaultSecurityGroup"),
            "bandwidthThrottling": obj.get("bandwidthThrottling"),
            "createPublicIP": obj.get("createPublicIP"),
            "dataPlaneRouting": ReplicationConfigurationDataPlaneRouting.from_dict(obj["dataPlaneRouting"]) if obj.get("dataPlaneRouting") is not None else None,
            "defaultLargeStagingDiskType": ReplicationConfigurationDefaultLargeStagingDiskType.from_dict(obj["defaultLargeStagingDiskType"]) if obj.get("defaultLargeStagingDiskType") is not None else None,
            "ebsEncryption": ReplicationConfigurationEbsEncryption.from_dict(obj["ebsEncryption"]) if obj.get("ebsEncryption") is not None else None,
            "ebsEncryptionKeyArn": obj.get("ebsEncryptionKeyArn"),
            "name": obj.get("name"),
            "replicatedDisks": obj.get("replicatedDisks"),
            "replicationServerInstanceType": obj.get("replicationServerInstanceType"),
            "replicationServersSecurityGroupsIDs": obj.get("replicationServersSecurityGroupsIDs"),
            "sourceServerID": obj.get("sourceServerID"),
            "stagingAreaSubnetId": obj.get("stagingAreaSubnetId"),
            "stagingAreaTags": obj.get("stagingAreaTags"),
            "useDedicatedReplicationServer": obj.get("useDedicatedReplicationServer")
        })
        return _obj


