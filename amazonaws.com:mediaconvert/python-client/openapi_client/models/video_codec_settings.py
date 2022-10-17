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
from openapi_client.models.video_codec_settings_av1_settings import VideoCodecSettingsAv1Settings
from openapi_client.models.video_codec_settings_avc_intra_settings import VideoCodecSettingsAvcIntraSettings
from openapi_client.models.video_codec_settings_frame_capture_settings import VideoCodecSettingsFrameCaptureSettings
from openapi_client.models.video_codec_settings_h264_settings import VideoCodecSettingsH264Settings
from openapi_client.models.video_codec_settings_h265_settings import VideoCodecSettingsH265Settings
from openapi_client.models.video_codec_settings_mpeg2_settings import VideoCodecSettingsMpeg2Settings
from openapi_client.models.video_codec_settings_prores_settings import VideoCodecSettingsProresSettings
from openapi_client.models.video_codec_settings_vc3_settings import VideoCodecSettingsVc3Settings
from openapi_client.models.video_codec_settings_vp8_settings import VideoCodecSettingsVp8Settings
from openapi_client.models.video_codec_settings_vp9_settings import VideoCodecSettingsVp9Settings
from openapi_client.models.video_codec_settings_xavc_settings import VideoCodecSettingsXavcSettings
from typing import Optional, Set
from typing_extensions import Self

class VideoCodecSettings(BaseModel):
    """
    Video codec settings, (CodecSettings) under (VideoDescription), contains the group of settings related to video encoding. The settings in this group vary depending on the value that you choose for Video codec (Codec). For each codec enum that you choose, define the corresponding settings object. The following lists the codec enum, settings object pairs. * AV1, Av1Settings * AVC_INTRA, AvcIntraSettings * FRAME_CAPTURE, FrameCaptureSettings * H_264, H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES, ProresSettings * VC3, Vc3Settings * VP8, Vp8Settings * VP9, Vp9Settings * XAVC, XavcSettings
    """ # noqa: E501
    av1_settings: Optional[VideoCodecSettingsAv1Settings] = Field(default=None, alias="Av1Settings")
    avc_intra_settings: Optional[VideoCodecSettingsAvcIntraSettings] = Field(default=None, alias="AvcIntraSettings")
    codec: Optional[Any] = Field(default=None, alias="Codec")
    frame_capture_settings: Optional[VideoCodecSettingsFrameCaptureSettings] = Field(default=None, alias="FrameCaptureSettings")
    h264_settings: Optional[VideoCodecSettingsH264Settings] = Field(default=None, alias="H264Settings")
    h265_settings: Optional[VideoCodecSettingsH265Settings] = Field(default=None, alias="H265Settings")
    mpeg2_settings: Optional[VideoCodecSettingsMpeg2Settings] = Field(default=None, alias="Mpeg2Settings")
    prores_settings: Optional[VideoCodecSettingsProresSettings] = Field(default=None, alias="ProresSettings")
    vc3_settings: Optional[VideoCodecSettingsVc3Settings] = Field(default=None, alias="Vc3Settings")
    vp8_settings: Optional[VideoCodecSettingsVp8Settings] = Field(default=None, alias="Vp8Settings")
    vp9_settings: Optional[VideoCodecSettingsVp9Settings] = Field(default=None, alias="Vp9Settings")
    xavc_settings: Optional[VideoCodecSettingsXavcSettings] = Field(default=None, alias="XavcSettings")
    __properties: ClassVar[List[str]] = ["Av1Settings", "AvcIntraSettings", "Codec", "FrameCaptureSettings", "H264Settings", "H265Settings", "Mpeg2Settings", "ProresSettings", "Vc3Settings", "Vp8Settings", "Vp9Settings", "XavcSettings"]

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
        """Create an instance of VideoCodecSettings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of av1_settings
        if self.av1_settings:
            _dict['Av1Settings'] = self.av1_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of avc_intra_settings
        if self.avc_intra_settings:
            _dict['AvcIntraSettings'] = self.avc_intra_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of codec
        if self.codec:
            _dict['Codec'] = self.codec.to_dict()
        # override the default output from pydantic by calling `to_dict()` of frame_capture_settings
        if self.frame_capture_settings:
            _dict['FrameCaptureSettings'] = self.frame_capture_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of h264_settings
        if self.h264_settings:
            _dict['H264Settings'] = self.h264_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of h265_settings
        if self.h265_settings:
            _dict['H265Settings'] = self.h265_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of mpeg2_settings
        if self.mpeg2_settings:
            _dict['Mpeg2Settings'] = self.mpeg2_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of prores_settings
        if self.prores_settings:
            _dict['ProresSettings'] = self.prores_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of vc3_settings
        if self.vc3_settings:
            _dict['Vc3Settings'] = self.vc3_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of vp8_settings
        if self.vp8_settings:
            _dict['Vp8Settings'] = self.vp8_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of vp9_settings
        if self.vp9_settings:
            _dict['Vp9Settings'] = self.vp9_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of xavc_settings
        if self.xavc_settings:
            _dict['XavcSettings'] = self.xavc_settings.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of VideoCodecSettings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Av1Settings": VideoCodecSettingsAv1Settings.from_dict(obj["Av1Settings"]) if obj.get("Av1Settings") is not None else None,
            "AvcIntraSettings": VideoCodecSettingsAvcIntraSettings.from_dict(obj["AvcIntraSettings"]) if obj.get("AvcIntraSettings") is not None else None,
            "Codec": VideoCodec.from_dict(obj["Codec"]) if obj.get("Codec") is not None else None,
            "FrameCaptureSettings": VideoCodecSettingsFrameCaptureSettings.from_dict(obj["FrameCaptureSettings"]) if obj.get("FrameCaptureSettings") is not None else None,
            "H264Settings": VideoCodecSettingsH264Settings.from_dict(obj["H264Settings"]) if obj.get("H264Settings") is not None else None,
            "H265Settings": VideoCodecSettingsH265Settings.from_dict(obj["H265Settings"]) if obj.get("H265Settings") is not None else None,
            "Mpeg2Settings": VideoCodecSettingsMpeg2Settings.from_dict(obj["Mpeg2Settings"]) if obj.get("Mpeg2Settings") is not None else None,
            "ProresSettings": VideoCodecSettingsProresSettings.from_dict(obj["ProresSettings"]) if obj.get("ProresSettings") is not None else None,
            "Vc3Settings": VideoCodecSettingsVc3Settings.from_dict(obj["Vc3Settings"]) if obj.get("Vc3Settings") is not None else None,
            "Vp8Settings": VideoCodecSettingsVp8Settings.from_dict(obj["Vp8Settings"]) if obj.get("Vp8Settings") is not None else None,
            "Vp9Settings": VideoCodecSettingsVp9Settings.from_dict(obj["Vp9Settings"]) if obj.get("Vp9Settings") is not None else None,
            "XavcSettings": VideoCodecSettingsXavcSettings.from_dict(obj["XavcSettings"]) if obj.get("XavcSettings") is not None else None
        })
        return _obj


