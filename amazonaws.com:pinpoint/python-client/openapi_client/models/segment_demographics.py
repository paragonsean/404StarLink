# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
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
from openapi_client.models.segment_demographics_app_version import SegmentDemographicsAppVersion
from openapi_client.models.segment_demographics_channel import SegmentDemographicsChannel
from openapi_client.models.segment_demographics_device_type import SegmentDemographicsDeviceType
from openapi_client.models.segment_demographics_make import SegmentDemographicsMake
from openapi_client.models.segment_demographics_model import SegmentDemographicsModel
from openapi_client.models.segment_demographics_platform import SegmentDemographicsPlatform
from typing import Optional, Set
from typing_extensions import Self

class SegmentDemographics(BaseModel):
    """
    Specifies demographic-based dimension settings for including or excluding endpoints from a segment. These settings derive from characteristics of endpoint devices, such as platform, make, and model.
    """ # noqa: E501
    app_version: Optional[SegmentDemographicsAppVersion] = Field(default=None, alias="AppVersion")
    channel: Optional[SegmentDemographicsChannel] = Field(default=None, alias="Channel")
    device_type: Optional[SegmentDemographicsDeviceType] = Field(default=None, alias="DeviceType")
    make: Optional[SegmentDemographicsMake] = Field(default=None, alias="Make")
    model: Optional[SegmentDemographicsModel] = Field(default=None, alias="Model")
    platform: Optional[SegmentDemographicsPlatform] = Field(default=None, alias="Platform")
    __properties: ClassVar[List[str]] = ["AppVersion", "Channel", "DeviceType", "Make", "Model", "Platform"]

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
        """Create an instance of SegmentDemographics from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of app_version
        if self.app_version:
            _dict['AppVersion'] = self.app_version.to_dict()
        # override the default output from pydantic by calling `to_dict()` of channel
        if self.channel:
            _dict['Channel'] = self.channel.to_dict()
        # override the default output from pydantic by calling `to_dict()` of device_type
        if self.device_type:
            _dict['DeviceType'] = self.device_type.to_dict()
        # override the default output from pydantic by calling `to_dict()` of make
        if self.make:
            _dict['Make'] = self.make.to_dict()
        # override the default output from pydantic by calling `to_dict()` of model
        if self.model:
            _dict['Model'] = self.model.to_dict()
        # override the default output from pydantic by calling `to_dict()` of platform
        if self.platform:
            _dict['Platform'] = self.platform.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of SegmentDemographics from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "AppVersion": SegmentDemographicsAppVersion.from_dict(obj["AppVersion"]) if obj.get("AppVersion") is not None else None,
            "Channel": SegmentDemographicsChannel.from_dict(obj["Channel"]) if obj.get("Channel") is not None else None,
            "DeviceType": SegmentDemographicsDeviceType.from_dict(obj["DeviceType"]) if obj.get("DeviceType") is not None else None,
            "Make": SegmentDemographicsMake.from_dict(obj["Make"]) if obj.get("Make") is not None else None,
            "Model": SegmentDemographicsModel.from_dict(obj["Model"]) if obj.get("Model") is not None else None,
            "Platform": SegmentDemographicsPlatform.from_dict(obj["Platform"]) if obj.get("Platform") is not None else None
        })
        return _obj


