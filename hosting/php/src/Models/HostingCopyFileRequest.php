<?php

// This file is auto-generated, don't edit it. Thanks.
namespace Aliyun\Hosting\SDK\Models;

use AlibabaCloud\Tea\Model;

/**
 * copy file request
 */
class HostingCopyFileRequest extends Model {
    protected $_name = [
        'driveId' => 'drive_id',
        'filePath' => 'file_path',
        'newName' => 'new_name',
        'overwrite' => 'overwrite',
        'shareId' => 'share_id',
        'toDriveId' => 'to_drive_id',
        'toParentFilePath' => 'to_parent_file_path',
        'toShareId' => 'to_share_id',
    ];
    protected $_default = [
        'overwrite' => 'false',
    ];
    public function validate() {
        Model::validatePattern('driveId', $this->driveId, '[0-9]+');
        Model::validatePattern('shareId', $this->shareId, '[0-9a-zA-Z-]+');
        Model::validatePattern('toDriveId', $this->toDriveId, '[0-9]+');
        Model::validateRequired('filePath', $this->filePath, true);
        Model::validateRequired('toParentFilePath', $this->toParentFilePath, true);
        Model::validateMaxLength('newName', $this->newName, 1024);
        Model::validateMinLength('newName', $this->newName, 1);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->driveId) {
            $res['drive_id'] = $this->driveId;
        }
        if (null !== $this->filePath) {
            $res['file_path'] = $this->filePath;
        }
        if (null !== $this->newName) {
            $res['new_name'] = $this->newName;
        }
        if (null !== $this->overwrite) {
            $res['overwrite'] = $this->overwrite;
        }
        if (null !== $this->shareId) {
            $res['share_id'] = $this->shareId;
        }
        if (null !== $this->toDriveId) {
            $res['to_drive_id'] = $this->toDriveId;
        }
        if (null !== $this->toParentFilePath) {
            $res['to_parent_file_path'] = $this->toParentFilePath;
        }
        if (null !== $this->toShareId) {
            $res['to_share_id'] = $this->toShareId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return HostingCopyFileRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['drive_id'])){
            $model->driveId = $map['drive_id'];
        }
        if(isset($map['file_path'])){
            $model->filePath = $map['file_path'];
        }
        if(isset($map['new_name'])){
            $model->newName = $map['new_name'];
        }
        if(isset($map['overwrite'])){
            $model->overwrite = $map['overwrite'];
        }
        if(isset($map['share_id'])){
            $model->shareId = $map['share_id'];
        }
        if(isset($map['to_drive_id'])){
            $model->toDriveId = $map['to_drive_id'];
        }
        if(isset($map['to_parent_file_path'])){
            $model->toParentFilePath = $map['to_parent_file_path'];
        }
        if(isset($map['to_share_id'])){
            $model->toShareId = $map['to_share_id'];
        }
        return $model;
    }
    /**
     * @description drive_id
     * @example 1
     * @var string
     */
    public $driveId;

    /**
     * @description file_path
     * @example /a/b/c.jpg
     * @var string
     */
    public $filePath;

    /**
     * @description new_name
     * @example ccp.jpg
     * @var string
     */
    public $newName;

    /**
     * @description overwrite
type: boolean
     * @var bool
     */
    public $overwrite;

    /**
     * @description share_id
     * @example 3d336314-63c8-4d96-bce0-17aefb6833b6
     * @var string
     */
    public $shareId;

    /**
     * @description to_drive_id
     * @example 1
     * @var string
     */
    public $toDriveId;

    /**
     * @description to_parent_file_path
     * @example /a/b/c/
     * @var string
     */
    public $toParentFilePath;

    /**
     * @description share_id
     * @example 3d336314-63c8-4d96-bce0-17aefb6833b6
     * @var string
     */
    public $toShareId;

}
