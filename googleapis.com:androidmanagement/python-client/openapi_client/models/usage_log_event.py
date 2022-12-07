# coding: utf-8

"""
    Android Management API

    The Android Management API provides remote enterprise management of Android devices and apps.

    The version of the OpenAPI document: v1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.adb_shell_command_event import AdbShellCommandEvent
from openapi_client.models.app_process_start_event import AppProcessStartEvent
from openapi_client.models.cert_authority_installed_event import CertAuthorityInstalledEvent
from openapi_client.models.cert_authority_removed_event import CertAuthorityRemovedEvent
from openapi_client.models.cert_validation_failure_event import CertValidationFailureEvent
from openapi_client.models.connect_event import ConnectEvent
from openapi_client.models.crypto_self_test_completed_event import CryptoSelfTestCompletedEvent
from openapi_client.models.dns_event import DnsEvent
from openapi_client.models.file_pulled_event import FilePulledEvent
from openapi_client.models.file_pushed_event import FilePushedEvent
from openapi_client.models.key_destruction_event import KeyDestructionEvent
from openapi_client.models.key_generated_event import KeyGeneratedEvent
from openapi_client.models.key_import_event import KeyImportEvent
from openapi_client.models.key_integrity_violation_event import KeyIntegrityViolationEvent
from openapi_client.models.keyguard_dismiss_auth_attempt_event import KeyguardDismissAuthAttemptEvent
from openapi_client.models.media_mount_event import MediaMountEvent
from openapi_client.models.media_unmount_event import MediaUnmountEvent
from openapi_client.models.os_startup_event import OsStartupEvent
from openapi_client.models.remote_lock_event import RemoteLockEvent
from typing import Optional, Set
from typing_extensions import Self

class UsageLogEvent(BaseModel):
    """
    An event logged on the device.
    """ # noqa: E501
    adb_shell_command_event: Optional[AdbShellCommandEvent] = Field(default=None, alias="adbShellCommandEvent")
    adb_shell_interactive_event: Optional[Dict[str, Any]] = Field(default=None, description="An ADB interactive shell was opened via “adb shell”. Intentionally empty.", alias="adbShellInteractiveEvent")
    app_process_start_event: Optional[AppProcessStartEvent] = Field(default=None, alias="appProcessStartEvent")
    cert_authority_installed_event: Optional[CertAuthorityInstalledEvent] = Field(default=None, alias="certAuthorityInstalledEvent")
    cert_authority_removed_event: Optional[CertAuthorityRemovedEvent] = Field(default=None, alias="certAuthorityRemovedEvent")
    cert_validation_failure_event: Optional[CertValidationFailureEvent] = Field(default=None, alias="certValidationFailureEvent")
    connect_event: Optional[ConnectEvent] = Field(default=None, alias="connectEvent")
    crypto_self_test_completed_event: Optional[CryptoSelfTestCompletedEvent] = Field(default=None, alias="cryptoSelfTestCompletedEvent")
    dns_event: Optional[DnsEvent] = Field(default=None, alias="dnsEvent")
    event_id: Optional[StrictStr] = Field(default=None, description="Unique id of the event.", alias="eventId")
    event_time: Optional[StrictStr] = Field(default=None, description="Device timestamp when the event was logged.", alias="eventTime")
    event_type: Optional[StrictStr] = Field(default=None, description="The particular usage log event type that was reported on the device. Use this to determine which event field to access.", alias="eventType")
    file_pulled_event: Optional[FilePulledEvent] = Field(default=None, alias="filePulledEvent")
    file_pushed_event: Optional[FilePushedEvent] = Field(default=None, alias="filePushedEvent")
    key_destruction_event: Optional[KeyDestructionEvent] = Field(default=None, alias="keyDestructionEvent")
    key_generated_event: Optional[KeyGeneratedEvent] = Field(default=None, alias="keyGeneratedEvent")
    key_import_event: Optional[KeyImportEvent] = Field(default=None, alias="keyImportEvent")
    key_integrity_violation_event: Optional[KeyIntegrityViolationEvent] = Field(default=None, alias="keyIntegrityViolationEvent")
    keyguard_dismiss_auth_attempt_event: Optional[KeyguardDismissAuthAttemptEvent] = Field(default=None, alias="keyguardDismissAuthAttemptEvent")
    keyguard_dismissed_event: Optional[Dict[str, Any]] = Field(default=None, description="The keyguard was dismissed. Intentionally empty.", alias="keyguardDismissedEvent")
    keyguard_secured_event: Optional[Dict[str, Any]] = Field(default=None, description="The device was locked either by user or timeout. Intentionally empty.", alias="keyguardSecuredEvent")
    log_buffer_size_critical_event: Optional[Dict[str, Any]] = Field(default=None, description="The usageLog buffer on the device has reached 90% of its capacity, therefore older events may be dropped. Intentionally empty.", alias="logBufferSizeCriticalEvent")
    logging_started_event: Optional[Dict[str, Any]] = Field(default=None, description="usageLog policy has been enabled. Intentionally empty.", alias="loggingStartedEvent")
    logging_stopped_event: Optional[Dict[str, Any]] = Field(default=None, description="usageLog policy has been disabled. Intentionally empty.", alias="loggingStoppedEvent")
    media_mount_event: Optional[MediaMountEvent] = Field(default=None, alias="mediaMountEvent")
    media_unmount_event: Optional[MediaUnmountEvent] = Field(default=None, alias="mediaUnmountEvent")
    os_shutdown_event: Optional[Dict[str, Any]] = Field(default=None, description="Device was shutdown. Intentionally empty.", alias="osShutdownEvent")
    os_startup_event: Optional[OsStartupEvent] = Field(default=None, alias="osStartupEvent")
    remote_lock_event: Optional[RemoteLockEvent] = Field(default=None, alias="remoteLockEvent")
    wipe_failure_event: Optional[Dict[str, Any]] = Field(default=None, description="The work profile or company-owned device failed to wipe when requested. This could be user initiated or admin initiated e.g. delete was received. Intentionally empty.", alias="wipeFailureEvent")
    __properties: ClassVar[List[str]] = ["adbShellCommandEvent", "adbShellInteractiveEvent", "appProcessStartEvent", "certAuthorityInstalledEvent", "certAuthorityRemovedEvent", "certValidationFailureEvent", "connectEvent", "cryptoSelfTestCompletedEvent", "dnsEvent", "eventId", "eventTime", "eventType", "filePulledEvent", "filePushedEvent", "keyDestructionEvent", "keyGeneratedEvent", "keyImportEvent", "keyIntegrityViolationEvent", "keyguardDismissAuthAttemptEvent", "keyguardDismissedEvent", "keyguardSecuredEvent", "logBufferSizeCriticalEvent", "loggingStartedEvent", "loggingStoppedEvent", "mediaMountEvent", "mediaUnmountEvent", "osShutdownEvent", "osStartupEvent", "remoteLockEvent", "wipeFailureEvent"]

    @field_validator('event_type')
    def event_type_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['EVENT_TYPE_UNSPECIFIED', 'ADB_SHELL_COMMAND', 'ADB_SHELL_INTERACTIVE', 'APP_PROCESS_START', 'KEYGUARD_DISMISSED', 'KEYGUARD_DISMISS_AUTH_ATTEMPT', 'KEYGUARD_SECURED', 'FILE_PULLED', 'FILE_PUSHED', 'CERT_AUTHORITY_INSTALLED', 'CERT_AUTHORITY_REMOVED', 'CERT_VALIDATION_FAILURE', 'CRYPTO_SELF_TEST_COMPLETED', 'KEY_DESTRUCTION', 'KEY_GENERATED', 'KEY_IMPORT', 'KEY_INTEGRITY_VIOLATION', 'LOGGING_STARTED', 'LOGGING_STOPPED', 'LOG_BUFFER_SIZE_CRITICAL', 'MEDIA_MOUNT', 'MEDIA_UNMOUNT', 'OS_SHUTDOWN', 'OS_STARTUP', 'REMOTE_LOCK', 'WIPE_FAILURE', 'CONNECT', 'DNS']):
            raise ValueError("must be one of enum values ('EVENT_TYPE_UNSPECIFIED', 'ADB_SHELL_COMMAND', 'ADB_SHELL_INTERACTIVE', 'APP_PROCESS_START', 'KEYGUARD_DISMISSED', 'KEYGUARD_DISMISS_AUTH_ATTEMPT', 'KEYGUARD_SECURED', 'FILE_PULLED', 'FILE_PUSHED', 'CERT_AUTHORITY_INSTALLED', 'CERT_AUTHORITY_REMOVED', 'CERT_VALIDATION_FAILURE', 'CRYPTO_SELF_TEST_COMPLETED', 'KEY_DESTRUCTION', 'KEY_GENERATED', 'KEY_IMPORT', 'KEY_INTEGRITY_VIOLATION', 'LOGGING_STARTED', 'LOGGING_STOPPED', 'LOG_BUFFER_SIZE_CRITICAL', 'MEDIA_MOUNT', 'MEDIA_UNMOUNT', 'OS_SHUTDOWN', 'OS_STARTUP', 'REMOTE_LOCK', 'WIPE_FAILURE', 'CONNECT', 'DNS')")
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
        """Create an instance of UsageLogEvent from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of adb_shell_command_event
        if self.adb_shell_command_event:
            _dict['adbShellCommandEvent'] = self.adb_shell_command_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of app_process_start_event
        if self.app_process_start_event:
            _dict['appProcessStartEvent'] = self.app_process_start_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of cert_authority_installed_event
        if self.cert_authority_installed_event:
            _dict['certAuthorityInstalledEvent'] = self.cert_authority_installed_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of cert_authority_removed_event
        if self.cert_authority_removed_event:
            _dict['certAuthorityRemovedEvent'] = self.cert_authority_removed_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of cert_validation_failure_event
        if self.cert_validation_failure_event:
            _dict['certValidationFailureEvent'] = self.cert_validation_failure_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of connect_event
        if self.connect_event:
            _dict['connectEvent'] = self.connect_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of crypto_self_test_completed_event
        if self.crypto_self_test_completed_event:
            _dict['cryptoSelfTestCompletedEvent'] = self.crypto_self_test_completed_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of dns_event
        if self.dns_event:
            _dict['dnsEvent'] = self.dns_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of file_pulled_event
        if self.file_pulled_event:
            _dict['filePulledEvent'] = self.file_pulled_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of file_pushed_event
        if self.file_pushed_event:
            _dict['filePushedEvent'] = self.file_pushed_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of key_destruction_event
        if self.key_destruction_event:
            _dict['keyDestructionEvent'] = self.key_destruction_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of key_generated_event
        if self.key_generated_event:
            _dict['keyGeneratedEvent'] = self.key_generated_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of key_import_event
        if self.key_import_event:
            _dict['keyImportEvent'] = self.key_import_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of key_integrity_violation_event
        if self.key_integrity_violation_event:
            _dict['keyIntegrityViolationEvent'] = self.key_integrity_violation_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of keyguard_dismiss_auth_attempt_event
        if self.keyguard_dismiss_auth_attempt_event:
            _dict['keyguardDismissAuthAttemptEvent'] = self.keyguard_dismiss_auth_attempt_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of media_mount_event
        if self.media_mount_event:
            _dict['mediaMountEvent'] = self.media_mount_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of media_unmount_event
        if self.media_unmount_event:
            _dict['mediaUnmountEvent'] = self.media_unmount_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of os_startup_event
        if self.os_startup_event:
            _dict['osStartupEvent'] = self.os_startup_event.to_dict()
        # override the default output from pydantic by calling `to_dict()` of remote_lock_event
        if self.remote_lock_event:
            _dict['remoteLockEvent'] = self.remote_lock_event.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of UsageLogEvent from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "adbShellCommandEvent": AdbShellCommandEvent.from_dict(obj["adbShellCommandEvent"]) if obj.get("adbShellCommandEvent") is not None else None,
            "adbShellInteractiveEvent": obj.get("adbShellInteractiveEvent"),
            "appProcessStartEvent": AppProcessStartEvent.from_dict(obj["appProcessStartEvent"]) if obj.get("appProcessStartEvent") is not None else None,
            "certAuthorityInstalledEvent": CertAuthorityInstalledEvent.from_dict(obj["certAuthorityInstalledEvent"]) if obj.get("certAuthorityInstalledEvent") is not None else None,
            "certAuthorityRemovedEvent": CertAuthorityRemovedEvent.from_dict(obj["certAuthorityRemovedEvent"]) if obj.get("certAuthorityRemovedEvent") is not None else None,
            "certValidationFailureEvent": CertValidationFailureEvent.from_dict(obj["certValidationFailureEvent"]) if obj.get("certValidationFailureEvent") is not None else None,
            "connectEvent": ConnectEvent.from_dict(obj["connectEvent"]) if obj.get("connectEvent") is not None else None,
            "cryptoSelfTestCompletedEvent": CryptoSelfTestCompletedEvent.from_dict(obj["cryptoSelfTestCompletedEvent"]) if obj.get("cryptoSelfTestCompletedEvent") is not None else None,
            "dnsEvent": DnsEvent.from_dict(obj["dnsEvent"]) if obj.get("dnsEvent") is not None else None,
            "eventId": obj.get("eventId"),
            "eventTime": obj.get("eventTime"),
            "eventType": obj.get("eventType"),
            "filePulledEvent": FilePulledEvent.from_dict(obj["filePulledEvent"]) if obj.get("filePulledEvent") is not None else None,
            "filePushedEvent": FilePushedEvent.from_dict(obj["filePushedEvent"]) if obj.get("filePushedEvent") is not None else None,
            "keyDestructionEvent": KeyDestructionEvent.from_dict(obj["keyDestructionEvent"]) if obj.get("keyDestructionEvent") is not None else None,
            "keyGeneratedEvent": KeyGeneratedEvent.from_dict(obj["keyGeneratedEvent"]) if obj.get("keyGeneratedEvent") is not None else None,
            "keyImportEvent": KeyImportEvent.from_dict(obj["keyImportEvent"]) if obj.get("keyImportEvent") is not None else None,
            "keyIntegrityViolationEvent": KeyIntegrityViolationEvent.from_dict(obj["keyIntegrityViolationEvent"]) if obj.get("keyIntegrityViolationEvent") is not None else None,
            "keyguardDismissAuthAttemptEvent": KeyguardDismissAuthAttemptEvent.from_dict(obj["keyguardDismissAuthAttemptEvent"]) if obj.get("keyguardDismissAuthAttemptEvent") is not None else None,
            "keyguardDismissedEvent": obj.get("keyguardDismissedEvent"),
            "keyguardSecuredEvent": obj.get("keyguardSecuredEvent"),
            "logBufferSizeCriticalEvent": obj.get("logBufferSizeCriticalEvent"),
            "loggingStartedEvent": obj.get("loggingStartedEvent"),
            "loggingStoppedEvent": obj.get("loggingStoppedEvent"),
            "mediaMountEvent": MediaMountEvent.from_dict(obj["mediaMountEvent"]) if obj.get("mediaMountEvent") is not None else None,
            "mediaUnmountEvent": MediaUnmountEvent.from_dict(obj["mediaUnmountEvent"]) if obj.get("mediaUnmountEvent") is not None else None,
            "osShutdownEvent": obj.get("osShutdownEvent"),
            "osStartupEvent": OsStartupEvent.from_dict(obj["osStartupEvent"]) if obj.get("osStartupEvent") is not None else None,
            "remoteLockEvent": RemoteLockEvent.from_dict(obj["remoteLockEvent"]) if obj.get("remoteLockEvent") is not None else None,
            "wipeFailureEvent": obj.get("wipeFailureEvent")
        })
        return _obj


