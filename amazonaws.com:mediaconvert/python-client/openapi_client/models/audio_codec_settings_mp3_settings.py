# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
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
from openapi_client.models.int import int
from openapi_client.models.mp3_rate_control_mode import Mp3RateControlMode
from typing import Optional, Set
from typing_extensions import Self

class AudioCodecSettingsMp3Settings(BaseModel):
    """
    AudioCodecSettingsMp3Settings
    """ # noqa: E501
    bitrate: Optional[Any] = Field(default=None, alias="Bitrate")
    channels: Optional[Any] = Field(default=None, alias="Channels")
    rate_control_mode: Optional[Any] = Field(default=None, alias="RateControlMode")
    sample_rate: Optional[Any] = Field(default=None, alias="SampleRate")
    vbr_quality: Optional[Any] = Field(default=None, alias="VbrQuality")
    __properties: ClassVar[List[str]] = ["Bitrate", "Channels", "RateControlMode", "SampleRate", "VbrQuality"]

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
        """Create an instance of AudioCodecSettingsMp3Settings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of rate_control_mode
        if self.rate_control_mode:
            _dict['RateControlMode'] = self.rate_control_mode.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of AudioCodecSettingsMp3Settings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Bitrate": obj.get("Bitrate"),
            "Channels": obj.get("Channels"),
            "RateControlMode": Mp3RateControlMode.from_dict(obj["RateControlMode"]) if obj.get("RateControlMode") is not None else None,
            "SampleRate": obj.get("SampleRate"),
            "VbrQuality": obj.get("VbrQuality")
        })
        return _obj


