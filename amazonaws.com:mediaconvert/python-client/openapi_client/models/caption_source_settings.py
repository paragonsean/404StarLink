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
from openapi_client.models.caption_source_settings_ancillary_source_settings import CaptionSourceSettingsAncillarySourceSettings
from openapi_client.models.caption_source_settings_dvb_sub_source_settings import CaptionSourceSettingsDvbSubSourceSettings
from openapi_client.models.caption_source_settings_embedded_source_settings import CaptionSourceSettingsEmbeddedSourceSettings
from openapi_client.models.caption_source_settings_file_source_settings import CaptionSourceSettingsFileSourceSettings
from openapi_client.models.caption_source_settings_teletext_source_settings import CaptionSourceSettingsTeletextSourceSettings
from openapi_client.models.caption_source_settings_track_source_settings import CaptionSourceSettingsTrackSourceSettings
from openapi_client.models.caption_source_settings_webvtt_hls_source_settings import CaptionSourceSettingsWebvttHlsSourceSettings
from typing import Optional, Set
from typing_extensions import Self

class CaptionSourceSettings(BaseModel):
    """
    If your input captions are SCC, TTML, STL, SMI, SRT, or IMSC in an xml file, specify the URI of the input captions source file. If your input captions are IMSC in an IMF package, use TrackSourceSettings instead of FileSoureSettings.
    """ # noqa: E501
    ancillary_source_settings: Optional[CaptionSourceSettingsAncillarySourceSettings] = Field(default=None, alias="AncillarySourceSettings")
    dvb_sub_source_settings: Optional[CaptionSourceSettingsDvbSubSourceSettings] = Field(default=None, alias="DvbSubSourceSettings")
    embedded_source_settings: Optional[CaptionSourceSettingsEmbeddedSourceSettings] = Field(default=None, alias="EmbeddedSourceSettings")
    file_source_settings: Optional[CaptionSourceSettingsFileSourceSettings] = Field(default=None, alias="FileSourceSettings")
    source_type: Optional[Any] = Field(default=None, alias="SourceType")
    teletext_source_settings: Optional[CaptionSourceSettingsTeletextSourceSettings] = Field(default=None, alias="TeletextSourceSettings")
    track_source_settings: Optional[CaptionSourceSettingsTrackSourceSettings] = Field(default=None, alias="TrackSourceSettings")
    webvtt_hls_source_settings: Optional[CaptionSourceSettingsWebvttHlsSourceSettings] = Field(default=None, alias="WebvttHlsSourceSettings")
    __properties: ClassVar[List[str]] = ["AncillarySourceSettings", "DvbSubSourceSettings", "EmbeddedSourceSettings", "FileSourceSettings", "SourceType", "TeletextSourceSettings", "TrackSourceSettings", "WebvttHlsSourceSettings"]

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
        """Create an instance of CaptionSourceSettings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of ancillary_source_settings
        if self.ancillary_source_settings:
            _dict['AncillarySourceSettings'] = self.ancillary_source_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of dvb_sub_source_settings
        if self.dvb_sub_source_settings:
            _dict['DvbSubSourceSettings'] = self.dvb_sub_source_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of embedded_source_settings
        if self.embedded_source_settings:
            _dict['EmbeddedSourceSettings'] = self.embedded_source_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of file_source_settings
        if self.file_source_settings:
            _dict['FileSourceSettings'] = self.file_source_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of source_type
        if self.source_type:
            _dict['SourceType'] = self.source_type.to_dict()
        # override the default output from pydantic by calling `to_dict()` of teletext_source_settings
        if self.teletext_source_settings:
            _dict['TeletextSourceSettings'] = self.teletext_source_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of track_source_settings
        if self.track_source_settings:
            _dict['TrackSourceSettings'] = self.track_source_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of webvtt_hls_source_settings
        if self.webvtt_hls_source_settings:
            _dict['WebvttHlsSourceSettings'] = self.webvtt_hls_source_settings.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CaptionSourceSettings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "AncillarySourceSettings": CaptionSourceSettingsAncillarySourceSettings.from_dict(obj["AncillarySourceSettings"]) if obj.get("AncillarySourceSettings") is not None else None,
            "DvbSubSourceSettings": CaptionSourceSettingsDvbSubSourceSettings.from_dict(obj["DvbSubSourceSettings"]) if obj.get("DvbSubSourceSettings") is not None else None,
            "EmbeddedSourceSettings": CaptionSourceSettingsEmbeddedSourceSettings.from_dict(obj["EmbeddedSourceSettings"]) if obj.get("EmbeddedSourceSettings") is not None else None,
            "FileSourceSettings": CaptionSourceSettingsFileSourceSettings.from_dict(obj["FileSourceSettings"]) if obj.get("FileSourceSettings") is not None else None,
            "SourceType": CaptionSourceType.from_dict(obj["SourceType"]) if obj.get("SourceType") is not None else None,
            "TeletextSourceSettings": CaptionSourceSettingsTeletextSourceSettings.from_dict(obj["TeletextSourceSettings"]) if obj.get("TeletextSourceSettings") is not None else None,
            "TrackSourceSettings": CaptionSourceSettingsTrackSourceSettings.from_dict(obj["TrackSourceSettings"]) if obj.get("TrackSourceSettings") is not None else None,
            "WebvttHlsSourceSettings": CaptionSourceSettingsWebvttHlsSourceSettings.from_dict(obj["WebvttHlsSourceSettings"]) if obj.get("WebvttHlsSourceSettings") is not None else None
        })
        return _obj


