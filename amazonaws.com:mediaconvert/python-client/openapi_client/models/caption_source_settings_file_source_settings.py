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
from openapi_client.models.file_source_convert608_to708 import FileSourceConvert608To708
from openapi_client.models.file_source_settings_framerate import FileSourceSettingsFramerate
from openapi_client.models.file_source_time_delta_units import FileSourceTimeDeltaUnits
from openapi_client.models.int import int
from openapi_client.models.str import str
from typing import Optional, Set
from typing_extensions import Self

class CaptionSourceSettingsFileSourceSettings(BaseModel):
    """
    CaptionSourceSettingsFileSourceSettings
    """ # noqa: E501
    convert608_to708: Optional[Any] = Field(default=None, alias="Convert608To708")
    framerate: Optional[FileSourceSettingsFramerate] = Field(default=None, alias="Framerate")
    source_file: Optional[Any] = Field(default=None, alias="SourceFile")
    time_delta: Optional[Any] = Field(default=None, alias="TimeDelta")
    time_delta_units: Optional[Any] = Field(default=None, alias="TimeDeltaUnits")
    __properties: ClassVar[List[str]] = ["Convert608To708", "Framerate", "SourceFile", "TimeDelta", "TimeDeltaUnits"]

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
        """Create an instance of CaptionSourceSettingsFileSourceSettings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of convert608_to708
        if self.convert608_to708:
            _dict['Convert608To708'] = self.convert608_to708.to_dict()
        # override the default output from pydantic by calling `to_dict()` of framerate
        if self.framerate:
            _dict['Framerate'] = self.framerate.to_dict()
        # override the default output from pydantic by calling `to_dict()` of time_delta_units
        if self.time_delta_units:
            _dict['TimeDeltaUnits'] = self.time_delta_units.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CaptionSourceSettingsFileSourceSettings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Convert608To708": FileSourceConvert608To708.from_dict(obj["Convert608To708"]) if obj.get("Convert608To708") is not None else None,
            "Framerate": FileSourceSettingsFramerate.from_dict(obj["Framerate"]) if obj.get("Framerate") is not None else None,
            "SourceFile": obj.get("SourceFile"),
            "TimeDelta": obj.get("TimeDelta"),
            "TimeDeltaUnits": FileSourceTimeDeltaUnits.from_dict(obj["TimeDeltaUnits"]) if obj.get("TimeDeltaUnits") is not None else None
        })
        return _obj


