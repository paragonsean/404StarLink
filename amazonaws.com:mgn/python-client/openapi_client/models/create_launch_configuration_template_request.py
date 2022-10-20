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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from openapi_client.models.create_launch_configuration_template_request_large_volume_conf import CreateLaunchConfigurationTemplateRequestLargeVolumeConf
from openapi_client.models.create_launch_configuration_template_request_licensing import CreateLaunchConfigurationTemplateRequestLicensing
from openapi_client.models.create_launch_configuration_template_request_post_launch_actions import CreateLaunchConfigurationTemplateRequestPostLaunchActions
from typing import Optional, Set
from typing_extensions import Self

class CreateLaunchConfigurationTemplateRequest(BaseModel):
    """
    CreateLaunchConfigurationTemplateRequest
    """ # noqa: E501
    associate_public_ip_address: Optional[StrictBool] = Field(default=None, description="Associate public Ip address.", alias="associatePublicIpAddress")
    boot_mode: Optional[StrictStr] = Field(default=None, description="Launch configuration template boot mode.", alias="bootMode")
    copy_private_ip: Optional[StrictBool] = Field(default=None, description="Copy private Ip.", alias="copyPrivateIp")
    copy_tags: Optional[StrictBool] = Field(default=None, description="Copy tags.", alias="copyTags")
    enable_map_auto_tagging: Optional[StrictBool] = Field(default=None, description="Enable map auto tagging.", alias="enableMapAutoTagging")
    large_volume_conf: Optional[CreateLaunchConfigurationTemplateRequestLargeVolumeConf] = Field(default=None, alias="largeVolumeConf")
    launch_disposition: Optional[StrictStr] = Field(default=None, description="Launch disposition.", alias="launchDisposition")
    licensing: Optional[CreateLaunchConfigurationTemplateRequestLicensing] = None
    map_auto_tagging_mpe_id: Optional[Annotated[str, Field(min_length=0, strict=True, max_length=256)]] = Field(default=None, description="Launch configuration template map auto tagging MPE ID.", alias="mapAutoTaggingMpeID")
    post_launch_actions: Optional[CreateLaunchConfigurationTemplateRequestPostLaunchActions] = Field(default=None, alias="postLaunchActions")
    small_volume_conf: Optional[CreateLaunchConfigurationTemplateRequestLargeVolumeConf] = Field(default=None, alias="smallVolumeConf")
    small_volume_max_size: Optional[Annotated[int, Field(strict=True, ge=0)]] = Field(default=None, description="Small volume maximum size.", alias="smallVolumeMaxSize")
    tags: Optional[Dict[str, Annotated[str, Field(min_length=0, strict=True, max_length=256)]]] = Field(default=None, description="Request to associate tags during creation of a Launch Configuration Template.")
    target_instance_type_right_sizing_method: Optional[StrictStr] = Field(default=None, description="Target instance type right-sizing method.", alias="targetInstanceTypeRightSizingMethod")
    __properties: ClassVar[List[str]] = ["associatePublicIpAddress", "bootMode", "copyPrivateIp", "copyTags", "enableMapAutoTagging", "largeVolumeConf", "launchDisposition", "licensing", "mapAutoTaggingMpeID", "postLaunchActions", "smallVolumeConf", "smallVolumeMaxSize", "tags", "targetInstanceTypeRightSizingMethod"]

    @field_validator('boot_mode')
    def boot_mode_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['LEGACY_BIOS', 'UEFI']):
            raise ValueError("must be one of enum values ('LEGACY_BIOS', 'UEFI')")
        return value

    @field_validator('launch_disposition')
    def launch_disposition_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['STOPPED', 'STARTED']):
            raise ValueError("must be one of enum values ('STOPPED', 'STARTED')")
        return value

    @field_validator('target_instance_type_right_sizing_method')
    def target_instance_type_right_sizing_method_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['NONE', 'BASIC']):
            raise ValueError("must be one of enum values ('NONE', 'BASIC')")
        return value

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
        """Create an instance of CreateLaunchConfigurationTemplateRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of large_volume_conf
        if self.large_volume_conf:
            _dict['largeVolumeConf'] = self.large_volume_conf.to_dict()
        # override the default output from pydantic by calling `to_dict()` of licensing
        if self.licensing:
            _dict['licensing'] = self.licensing.to_dict()
        # override the default output from pydantic by calling `to_dict()` of post_launch_actions
        if self.post_launch_actions:
            _dict['postLaunchActions'] = self.post_launch_actions.to_dict()
        # override the default output from pydantic by calling `to_dict()` of small_volume_conf
        if self.small_volume_conf:
            _dict['smallVolumeConf'] = self.small_volume_conf.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CreateLaunchConfigurationTemplateRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "associatePublicIpAddress": obj.get("associatePublicIpAddress"),
            "bootMode": obj.get("bootMode"),
            "copyPrivateIp": obj.get("copyPrivateIp"),
            "copyTags": obj.get("copyTags"),
            "enableMapAutoTagging": obj.get("enableMapAutoTagging"),
            "largeVolumeConf": CreateLaunchConfigurationTemplateRequestLargeVolumeConf.from_dict(obj["largeVolumeConf"]) if obj.get("largeVolumeConf") is not None else None,
            "launchDisposition": obj.get("launchDisposition"),
            "licensing": CreateLaunchConfigurationTemplateRequestLicensing.from_dict(obj["licensing"]) if obj.get("licensing") is not None else None,
            "mapAutoTaggingMpeID": obj.get("mapAutoTaggingMpeID"),
            "postLaunchActions": CreateLaunchConfigurationTemplateRequestPostLaunchActions.from_dict(obj["postLaunchActions"]) if obj.get("postLaunchActions") is not None else None,
            "smallVolumeConf": CreateLaunchConfigurationTemplateRequestLargeVolumeConf.from_dict(obj["smallVolumeConf"]) if obj.get("smallVolumeConf") is not None else None,
            "smallVolumeMaxSize": obj.get("smallVolumeMaxSize"),
            "tags": obj.get("tags"),
            "targetInstanceTypeRightSizingMethod": obj.get("targetInstanceTypeRightSizingMethod")
        })
        return _obj


